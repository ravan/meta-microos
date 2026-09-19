SUMMARY = "Bash completion for ZynAddSubFX"
DESCRIPTION = "Bash command line completion support for ZynAddSubFX."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.6"

RPM_NAME = "zynaddsubfx-bash-completion-3.0.6-4.4.aarch64.rpm"
RPM_HASH = "af14ea40486bedad5ab26f5e46ecbe6f7afe09b1f83c3f74a6ddb3ed566e6fbc7a1dc08bfcc37efa8586c44d00ee97a83dea3d07c9da79d26fefd4bd475d7d22"

RPROVIDES:${PN} += "zynaddsubfx-bash-completion"

RDEPENDS:${PN} += "bash \
zynaddsubfx"

inherit rpm
