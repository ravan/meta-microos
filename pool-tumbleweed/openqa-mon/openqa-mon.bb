SUMMARY = "CLI monitoring utility for openQA"
DESCRIPTION = "openqa-mon is a CLI monitoring client for openqa written in plain go."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "openqa-mon-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "6f46fc7ad8b169a5c2bba3e0822a028221050ea857e429730e75eedd435b766e0d4586548c4a602a84f54091a4e9c479d97d0b87d2d1f8aa1e2e12115efbe6c3"

RPROVIDES:${PN} += "openqa-mon"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
