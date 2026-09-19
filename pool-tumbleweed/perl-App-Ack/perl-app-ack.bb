SUMMARY = "Grep-Like Text Finder Perl Module"
DESCRIPTION = "App::Ack is a grep-like tool tailored to working with large trees of source \
code."
LICENSE = "Artistic-2.0"

PV = "3.10.0"

RPM_NAME = "perl-App-Ack-3.10.0-1.3.noarch.rpm"
RPM_HASH = "69bc3eae6a35e565c19c1b071d3e6e6cadd592b891a1688a05bcb09f58009879645f3ff6e51150ff557c610fc12624220aa30e028b49beb7159334c7026a573b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-App--Ack \
perl-App--Ack--ConfigDefault \
perl-App--Ack--ConfigFinder \
perl-App--Ack--ConfigLoader \
perl-App--Ack--File \
perl-App--Ack--Files \
perl-App--Ack--Filter \
perl-App--Ack--Filter--Collection \
perl-App--Ack--Filter--Default \
perl-App--Ack--Filter--Extension \
perl-App--Ack--Filter--ExtensionGroup \
perl-App--Ack--Filter--FirstLineMatch \
perl-App--Ack--Filter--Inverse \
perl-App--Ack--Filter--Is \
perl-App--Ack--Filter--IsGroup \
perl-App--Ack--Filter--IsPath \
perl-App--Ack--Filter--IsPathGroup \
perl-App--Ack--Filter--Match \
perl-App--Ack--Filter--MatchGroup \
perl-App-Ack"

RDEPENDS:${PN} += "perl-File--Next \
perl-base"

inherit rpm
