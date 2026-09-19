SUMMARY = "Internationalization Tool Collection"
DESCRIPTION = "Some scripts to support translators working on GNOME and similar \
programs. Data available in XML files (.oaf, .desktop, .sheet, and \
more) can be extracted into PO files. After translation, the new \
information is written back into the XML files."
LICENSE = "GPL-2.0-or-later"

PV = "0.51.0"

RPM_NAME = "intltool-0.51.0-8.9.noarch.rpm"
RPM_HASH = "c5aa2eefcdc9ac5800ffac040e9af690fa9141fef0bab078d014667f877002e274b2b52aadaedb506e2edadac07e71aa455620fce7f0070522fe7b1ad4864542"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "intltool \
xml-i18n-tools"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
gettext-tools \
perl-XML--Parser"

inherit rpm
