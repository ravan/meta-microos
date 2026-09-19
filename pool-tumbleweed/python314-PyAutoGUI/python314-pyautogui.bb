SUMMARY = "A Python module for GUI automation that can control the keyboard and mouse"
DESCRIPTION = "PyAutoGUI is a GUI automation Python module. It can be used to \
programmatically control the mouse and keyboard."
LICENSE = "BSD-3-Clause"

PV = "0.9.54"

RPM_NAME = "python314-PyAutoGUI-0.9.54-2.5.noarch.rpm"
RPM_HASH = "3cf4a06a7dcf601b288a61ff41a52d7669df4098ac0e347184a9edad05b51774a55832f5c9ea7c2d8e102178ceab30cf9f127ceb9b2835c428eb6027d0879d21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyautogui \
python314-PyAutoGUI \
python3dist-pyautogui"

RDEPENDS:${PN} += "python-abi \
python314-Pillow \
python314-PyMsgBox \
python314-PyScreeze \
python314-PyTweening \
python314-python-xlib"

inherit rpm
