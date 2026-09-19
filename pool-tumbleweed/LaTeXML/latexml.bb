SUMMARY = "TeX and LaTeX to XML translator"
DESCRIPTION = "LaTeXML is a TeX & LaTeX to XML, HTML, MathML, ePub, JATS, ... converter."
LICENSE = "SUSE-Public-Domain"

PV = "0.8.8"

RPM_NAME = "LaTeXML-0.8.8-2.6.noarch.rpm"
RPM_HASH = "e1fbad087c44bbe7c7bcbf2e79ca0faabc7a94fd601bbe2ff6fa30f033d238617de5fbb17579d0c18201ec4a3bf199cf5f15f1da092227d92ad0a670ef92b229"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "LaTeXML"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-Archive--Zip \
perl-DB-File \
perl-File--Which \
perl-Getopt--Long \
perl-IO--String \
perl-Image--Size \
perl-JSON--XS \
perl-LWP--Protocol--https \
perl-LaTeXML \
perl-Parse--RecDescent \
perl-Pod--Find \
perl-Test--Simple \
perl-Text--Unidecode \
perl-Time--HiRes \
perl-URI \
perl-UUID--Tiny \
perl-XML--LibXML \
perl-XML--LibXSLT"

inherit rpm
