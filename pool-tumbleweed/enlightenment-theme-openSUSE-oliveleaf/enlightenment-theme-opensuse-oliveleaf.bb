SUMMARY = "Enlightenment theme from openSUSE 13.1"
DESCRIPTION = "This is a darker theme for enlightenment, it was the default for openSUSE 13.1"
LICENSE = "BSD-2-Clause & LGPL-2.1 & CC-BY-SA-3.0"

PV = "20220219.1.26"

RPM_NAME = "enlightenment-theme-openSUSE-oliveleaf-20220219.1.26-2.2.noarch.rpm"
RPM_HASH = "bebf4f7f4922999caa6273407c02bb613c0610d24272e6264171e7e13883859eb2ec8e9fc7a0a068f27e88a6c7379aa5d4e9614265d59b11da6cc3c04589e698"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "enlightenment-theme \
enlightenment-theme-openSUSE-oliveleaf"

RDEPENDS:${PN} += ""

inherit rpm
