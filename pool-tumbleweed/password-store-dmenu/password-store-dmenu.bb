SUMMARY = "A dmenu interface to the 'pass' program"
DESCRIPTION = "A dmenu interface to 'pass', a password manager."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.4"

RPM_NAME = "password-store-dmenu-1.7.4-6.4.noarch.rpm"
RPM_HASH = "bd4ce5103e0d5f50a205c609adec0f240fc26c1fcc714844d46687d32906aad91484e37a2e28276e48c4f06e07e0cdd48b8b57e5dace78420efd75e26b08df3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "password-store-dmenu"

RDEPENDS:${PN} += "/usr/bin/bash \
dmenu \
password-store"

inherit rpm
