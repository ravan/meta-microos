SUMMARY = "Job-based library to send email through an SMTP server"
DESCRIPTION = "KSMTP is a job based library to send email through an SMTP server."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "ksmtp-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "fe0e7ec8200d70417406072958b3ba0b491d8560cb6919825dafc877f9aaaff837ed3bf1f6f46282bd82b7a6ba70f429533b5baf11e764e717af98b0d9a9ebf8"

RPROVIDES:${PN} += "ksmtp"

RDEPENDS:${PN} += ""

inherit rpm
