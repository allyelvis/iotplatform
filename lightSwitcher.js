const { spawn } = require('child_process');
const SpeechToText = require('speech-to-text');

const listener = new SpeechToText.Listener();

listener.startListening();
listener.on('data', (data) => {
  const command = data.text.toLowerCase();
  console.log('Command:', command);

  if (command.includes('turn on')) {
    // Send a command to the Java application to turn the light on
    const javaProcess = spawn('java', ['LightSwitcher', 'on']);
  } else if (command.includes('turn off')) {
    // Send a command to the Java application to turn the light off
    const javaProcess = spawn('java', ['LightSwitcher', 'off']);
  }
});
