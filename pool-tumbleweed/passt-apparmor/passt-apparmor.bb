SUMMARY = "Apparmor profiles for passt and pasta"
DESCRIPTION = "This package contains Apparmor profiles for passt and pasta."
LICENSE = "GPL-2.0-or-later & BSD-3-Clause"

PV = "20260612.a9c61ff"

RPM_NAME = "passt-apparmor-20260612.a9c61ff-1.3.noarch.rpm"
RPM_HASH = "1a91d8b7120639375a81d49f9d1765392e7e2d2ebaf96ef981fd9d7a9b41c20f20cb36f2161ae5049a96c833252dbef2436142c42afe1885de4da4b8bc21567e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-passt-apparmor \
passt-apparmor"

RDEPENDS:${PN} += "/usr/bin/sh \
apparmor-abstractions \
apparmor-parser \
passt"

inherit rpm
