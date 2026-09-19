SUMMARY = "Compare elements of two or more lists"
DESCRIPTION = "Compare elements of two or more lists"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.55"

RPM_NAME = "perl-List-Compare-0.55-1.28.noarch.rpm"
RPM_HASH = "f1662b33259c632e008d5b9a15cb5e660620769794673bacb0c7fd054c6c345f6727612e8b5d87850bd692f13d3dba36dc93565131a4ba5cbf3cee22070ed48f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-List--Compare \
perl-List--Compare--Accelerated \
perl-List--Compare--Base---Auxiliary \
perl-List--Compare--Base---Engine \
perl-List--Compare--Functional \
perl-List--Compare--Multiple \
perl-List--Compare--Multiple--Accelerated \
perl-List-Compare"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
