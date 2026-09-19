SUMMARY = "Dynamic prerequisites in meta files"
DESCRIPTION = "This module implements a format for describing dynamic prerequisites of a \
distribution."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.3.0"

RPM_NAME = "perl-CPAN-Requirements-Dynamic-0.3.0-1.1.noarch.rpm"
RPM_HASH = "724abd76c007c6f1dbf1bcc47d2b0ed7c55af07d163f132a16642b9772134744a0b193adb2e75d854b76f85c5dd7cb49b6a0179dfa8558d486fcf0d3ef4b2e0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CPAN--Requirements--Dynamic \
perl-CPAN-Requirements-Dynamic"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-CPAN--Meta--Prereqs \
perl-CPAN--Meta--Requirements--Range \
perl-ExtUtils--Config \
perl-ExtUtils--HasCompiler \
perl-IPC--Cmd \
perl-Parse--CPAN--Meta \
perl-Perl--OSType"

inherit rpm
