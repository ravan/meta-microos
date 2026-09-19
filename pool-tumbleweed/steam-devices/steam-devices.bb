SUMMARY = "Device support for Steam-related hardware"
DESCRIPTION = "The Steam Controller features dual trackpads, HD haptic feedback, dual-stage \
triggers, back grip buttons, and fully-customizable control schemes. \
Make sure that all users, which should have access to the steam-controller, \
are in the 'games' group. Steam VR is a full-featured, 360° room-scale \
virtual reality experience."
LICENSE = "MIT"

PV = "20260625+git.22ec85e"

RPM_NAME = "steam-devices-20260625+git.22ec85e-1.1.noarch.rpm"
RPM_HASH = "a7cdace0292a8b964714836f9b8fe888fe9db13b5456c52333572ab0b26eb02adb539d5a715758da5f02186a2ff18431d0a7c603e75e175ffc03a34da51a6953"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "steam-controller \
steam-devices \
steam-vr"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
