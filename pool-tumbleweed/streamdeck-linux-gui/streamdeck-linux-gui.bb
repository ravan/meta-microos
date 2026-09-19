SUMMARY = "Stream Deck tools (service, Web Interface, and UI)"
DESCRIPTION = "A service, Web Interface, and UI for interacting with your computer using a Stream Deck"
LICENSE = "MIT"

PV = "4.1.3"

RPM_NAME = "streamdeck-linux-gui-4.1.3-2.5.noarch.rpm"
RPM_HASH = "10a638ee1aa454e41ff17769554f6a7031126f8b7a4c9fe594a65f470b3eefa20e50f0cef552b188e87ea258f305d1823fed9a947a897d0991e82b18ad698b3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-streamdeck-linux-gui \
python3dist-streamdeck-linux-gui \
streamdeck-linux-gui \
streamdeck-ui"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-CairoSVG \
python3-Pillow \
python3-evdev \
python3-filetype \
python3-importlib-metadata \
python3-pynput \
python3-pyside6 \
python3-python-xlib \
python3-streamdeck"

inherit rpm
