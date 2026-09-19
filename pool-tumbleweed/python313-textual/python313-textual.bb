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

RPM_NAME = "python313-textual-8.2.8-2.1.noarch.rpm"
RPM_HASH = "ae3535ce4d33010cdff13f6ebb5aebf08b1338e8d918f3bf5d26f78d02da18a0d4ba853d83267153b3c36a5f0e5536ff06eb5367d24e096b1c8daa0bd11ba7fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-textual \
python3.13dist-textual \
python313-textual \
python3dist-textual"

RDEPENDS:${PN} += "-python313-platformdirs >= 3.6.0 with python313-platformdirs < 5 \
-python313-typing-extensions >= 4.4.0 with python313-typing-extensions < 5 \
python-abi \
python313-Pygments \
python313-markdown-it-py \
python313-rich"

inherit rpm
