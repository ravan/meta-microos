SUMMARY = "Fish Completion for wl-screenrec"
DESCRIPTION = "Fish command-line completion support for wl-screenrec."
LICENSE = "Apache-2.0"

PV = "0.2.0+git.20260517T151356.0925290"

RPM_NAME = "wl-screenrec-fish-completion-0.2.0+git.20260517T151356.0925290-1.1.noarch.rpm"
RPM_HASH = "cf2f4d76d8b659be2726c8eeb1d69af2e323a4ad638f66f57b4f71f2fb17f554b73df0af6628f429c95b444b3cc173189931d7c88bf14748c6ce449ffbb82f1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wl-screenrec-fish-completion"

RDEPENDS:${PN} += "fish \
wl-screenrec"

inherit rpm
