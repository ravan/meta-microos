SUMMARY = "TUI framework for Python"
DESCRIPTION = "Textual is a Python framework for creating interactive applications \
that run in your terminal. \
 \
It adds interactivity to Rich with a Python API inspired by modern \
web development. \
 \
On modern terminal software (installed by default on most systems), \
Textual apps can use 16.7 million colors with mouse support and \
smooth flicker-free animation. A layout engine and re-usable \
components make it possible to build apps that resemble the desktop \
and web experience."
LICENSE = "MIT"

PV = "8.2.8"

RPM_NAME = "python314-textual-8.2.8-2.1.noarch.rpm"
RPM_HASH = "59af7c7e4ba9cdb3d4d6c5843dbb4d3cfbbc87fbdec1f8c9f29ba56e3feace86eedf794c342b792585d7cf01475e58686426398952b494281e2c72db24eee54e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-textual \
python314-textual \
python3dist-textual"

RDEPENDS:${PN} += "-python314-platformdirs >= 3.6.0 with python314-platformdirs < 5 \
-python314-typing-extensions >= 4.4.0 with python314-typing-extensions < 5 \
python-abi \
python314-Pygments \
python314-markdown-it-py \
python314-rich"

inherit rpm
