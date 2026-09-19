SUMMARY = "Perl interface to Snowball stemmers"
DESCRIPTION = "Stemming reduces related words to a common root form -- for instance, \
'horse', 'horses', and 'horsing' all become 'hors'. Most commonly, stemming \
is deployed as part of a search application, allowing searches for a given \
term to match documents which contain other forms of that term. \
 \
Authors: \
-------- \
    Oleg Bartunov, <oleg at sai dot msu dot su> \
    Teodor Sigaev, <teodor at stack dot net> \
    Marvin Humphrey <marvin at rectangular dot com>"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.952"

RPM_NAME = "perl-Lingua-Stem-Snowball-0.952-14.55.aarch64.rpm"
RPM_HASH = "6330d5c7eb18518eb87610164f6a9e0b9898ca5c71a19817fda815a3e7e251072dcf02085440f9643991d6d3d8691daae3ae5d6aa676a51f282edfaad2818b9b"

RPROVIDES:${PN} += "perl-Lingua--Stem--Snowball \
perl-Lingua-Stem-Snowball"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
