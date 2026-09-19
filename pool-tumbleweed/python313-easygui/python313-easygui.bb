SUMMARY = "Function-driven python GUI programming"
DESCRIPTION = "EasyGui provides an interface for simple GUI interaction with a user. \
It's not event-driven and it does not require the programmer to know \
anything about tkinter, frames, widgets, callbacks or lambda."
LICENSE = "BSD-3-Clause"

PV = "0.98.3"

RPM_NAME = "python313-easygui-0.98.3-3.5.noarch.rpm"
RPM_HASH = "226f41564957378c46c010b937cf33d4241293c5274fb5590c065da067f704e92796a04c5f93fc124b33a7c2cf43a6218144bf0d943955da7762fd9db7f3ddee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-easygui \
python3.13dist-easygui \
python313-easygui \
python3dist-easygui"

RDEPENDS:${PN} += "python-abi"

inherit rpm
