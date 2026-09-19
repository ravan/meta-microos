SUMMARY = "Git tools for sending email"
DESCRIPTION = "Email interface for the GIT version control system."
LICENSE = "GPL-2.0-only"

PV = "2.55.0"

RPM_NAME = "git-email-2.55.0-3.2.aarch64.rpm"
RPM_HASH = "fec998ab14faa257ae5f213edf8729cbee1cc12396a3b3689ed0a579abe02f6a5070d1b7f9aa54b2ec3642cc4fa1f1ccd7c5a38079d00767c8ff2d27b795ea79"

RPROVIDES:${PN} += "git-email"

RDEPENDS:${PN} += "/usr/bin/perl \
git-core \
perl-Authen-SASL \
perl-Git \
perl-MailTools \
perl-Net-SMTP-SSL"

inherit rpm
