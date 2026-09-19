SUMMARY = "Memory mapping made simple and safe"
DESCRIPTION = "File::Map maps files or anonymous memory into perl variables."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.710.0"

RPM_NAME = "perl-File-Map-0.710.0-1.6.aarch64.rpm"
RPM_HASH = "034931a58c980a1557229be745abb55809c900660d8f5d22bae684bba55310e56940556aee80335562575db28af126ff38650227bb2f0dcf34faf03c8aac43eb"

RPROVIDES:${PN} += "perl-File--Map \
perl-File-Map"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0 \
perl-Sub--Exporter--Progressive"

inherit rpm
