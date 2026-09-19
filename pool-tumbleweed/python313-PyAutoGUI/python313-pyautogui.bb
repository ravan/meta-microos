SUMMARY = "A Python module for GUI automation that can control the keyboard and mouse"
DESCRIPTION = "PyAutoGUI is a GUI automation Python module. It can be used to \
programmatically control the mouse and keyboard."
LICENSE = "BSD-3-Clause"

PV = "0.9.54"

RPM_NAME = "python313-PyAutoGUI-0.9.54-2.5.noarch.rpm"
RPM_HASH = "be44ab0dcc592bb36f09dc4081342596846acfe7bbc421105662e23dbddd93cb87fd21051975432e8871cf133b65968ab1bd23ad8e6f05af4e372dd42b03a7df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyAutoGUI \
python3.13dist-pyautogui \
python313-PyAutoGUI \
python3dist-pyautogui"

RDEPENDS:${PN} += "python-abi \
python313-Pillow \
python313-PyMsgBox \
python313-PyScreeze \
python313-PyTweening \
python313-python-xlib"

inherit rpm
