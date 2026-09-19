SUMMARY = "OpenRGB systemd unit"
DESCRIPTION = "This package contains the systemd unit for OpenRGB."
LICENSE = "GPL-2.0-or-later"

PV = "1.0~rc3.1+git0.g5e81e26f"

RPM_NAME = "OpenRGB-systemd-unit-1.0~rc3.1+git0.g5e81e26f-1.1.noarch.rpm"
RPM_HASH = "8b06c9754c16865622dd849d4790b123c02c2b7dd219e8e17aab1aef5171295f0342bc243cc32cfe9ebcce964a1d7581391a3f1da20ea8bfd22a6c7c5a919293"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "OpenRGB-systemd-unit"

RDEPENDS:${PN} += "/usr/bin/sh \
OpenRGB"

inherit rpm
