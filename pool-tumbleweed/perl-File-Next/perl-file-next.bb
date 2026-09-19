SUMMARY = "File-finding iterator"
DESCRIPTION = "File-finding iterator"
LICENSE = "Artistic-2.0"

PV = "1.18"

RPM_NAME = "perl-File-Next-1.18-1.32.aarch64.rpm"
RPM_HASH = "9952d62008c94d420e49f5cf77af1fcdda0017fcb5578cbf619106f0bac891bfd92ced5c968e6a875c7c9c1f10fa6c124a04a2c992641b4210368037987a98fd"

RPROVIDES:${PN} += "perl-File--Next \
perl-File-Next"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-File--Temp \
perl-Test--More"

inherit rpm
