SUMMARY = "Check if your Manifest matches your distro"
DESCRIPTION = "Check if your Manifest matches your distro"
LICENSE = "Artistic-2.0"

PV = "1.43"

RPM_NAME = "perl-Test-CheckManifest-1.43-1.17.noarch.rpm"
RPM_HASH = "2d762c8745d50b1087b834562099e7a2df9ee0fd799ed758d2c779d94384046b36cc30222ec9ea3afc80033e666dcb509bb93fa55ec0bb697553ff655f367a90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--CheckManifest \
perl-Test-CheckManifest"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Cwd"

inherit rpm
