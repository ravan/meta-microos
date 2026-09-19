SUMMARY = "A Build Tool to Provide Desktop Translation"
DESCRIPTION = "This package provides a tool that will import translations for SUSE \
specific desktop files. \
 \
For more, see \
https://en.opensuse.org/openSUSE:Packaging_Conventions_RPM_Macros#%translate_suse_desktop"
LICENSE = "GPL-3.0-or-later"

PV = "0.20260506.ffee9bc"

RPM_NAME = "translate-suse-desktop-0.20260506.ffee9bc-1.2.noarch.rpm"
RPM_HASH = "aea70a08e09319e971247d4ae5c9a642bddd421b2c79b48f66b0c62988ce9ce2d6f4e682a5f8f6c1dfae207b9352c8eec3632b11cf194b3030c02486279f5029"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpm-macro-translate-suse-desktop \
translate-suse-desktop"

RDEPENDS:${PN} += "/usr/bin/bash \
intltool"

inherit rpm
