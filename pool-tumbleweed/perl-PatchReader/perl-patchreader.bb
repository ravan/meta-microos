SUMMARY = "Utilities to read and manipulate patches and CVS"
DESCRIPTION = "This perl library allows you to manipulate patches programmatically by chaining \
together a variety of objects that read, manipulate, and output patch \
information."
LICENSE = "GPL-2.0+ | Artistic-1.0"

PV = "0.9.6"

RPM_NAME = "perl-PatchReader-0.9.6-1.35.noarch.rpm"
RPM_HASH = "70a7ff0454cb8461d45a3c5fe3c4316ec2ab731fc773ea9e15ce1732518a24312a6c934ea93f5b89fee94969961ddfba18d0f9756a1de0e30d6f221848c792eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-PatchReader \
perl-PatchReader--AddCVSContext \
perl-PatchReader--Base \
perl-PatchReader--CVSClient \
perl-PatchReader--DiffPrinter--raw \
perl-PatchReader--DiffPrinter--template \
perl-PatchReader--FilterPatch \
perl-PatchReader--FixPatchRoot \
perl-PatchReader--NarrowPatch \
perl-PatchReader--PatchInfoGrabber \
perl-PatchReader--Raw"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Cwd \
perl-File--Temp"

inherit rpm
