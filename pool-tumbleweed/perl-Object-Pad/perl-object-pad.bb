SUMMARY = "Simple syntax for lexical field-based objects"
DESCRIPTION = "This module provides a simple syntax for creating object classes, which \
uses private variables that look like lexicals as object member fields."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.825.0"

RPM_NAME = "perl-Object-Pad-0.825.0-1.1.aarch64.rpm"
RPM_HASH = "2013ce59e196c725230c3d90f1aeeda80c03d042c7e6e9252d31eedd5a5ca8ff8562ef8b2a5d0fb11d3e4b09a7b0b6b4ccd345713464c292c4fd708b4100db13"

RPROVIDES:${PN} += "perl-Object--Pad \
perl-Object--Pad--ExtensionBuilder \
perl-Object--Pad--MOP--Class \
perl-Object--Pad--MOP--Field \
perl-Object--Pad--MOP--FieldAttr \
perl-Object--Pad--MOP--Method \
perl-Object--Pad--MetaFunctions \
perl-Object-Pad"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0 \
perl-File--ShareDir \
perl-XS--Parse--Keyword \
perl-XS--Parse--Sublike"

inherit rpm
