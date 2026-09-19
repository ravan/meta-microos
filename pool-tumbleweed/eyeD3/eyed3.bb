SUMMARY = "Audio files and ID3 Manipulation Tool"
DESCRIPTION = "eyeD3 is a Python tool for working with audio files, specifically MP3 \
files containing ID3 metadata (i.e. song info). \
 \
Features: \
- Python package for writing application and/or plugins. \
- Command-line tool driver script that supports plugins. viewer/editor \
  interface. \
- Easy editing/viewing of audio metadata from the command-line, using the \
  ‘classic’ plugin. \
- Support for ID3 versions 1.x, 2.2 (read-only), 2.3, and 2.4. \
- Support for the MP3 audio format exposing details such as play time, \
  bit rate, sampling frequency, etc. \
- Abstract design allowing future support for different audio formats and \
  metadata containers."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "0.9.9"

RPM_NAME = "eyeD3-0.9.9-1.4.noarch.rpm"
RPM_HASH = "5709dc75fc7ff68fc811ece6c2f0f13ff6ca8fd858e893605196bb9c2e224a1521cf5b72a413236dcf5e4ecf3992cbf4dddc898ffea3aa0b978fbf95ab73bcf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eyeD3"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python313-eyed3"

inherit rpm
