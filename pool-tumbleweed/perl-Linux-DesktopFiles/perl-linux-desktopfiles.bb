SUMMARY = "Fast parsing of the Linux desktop files"
DESCRIPTION = "The 'Linux::DesktopFiles', a very fast and simple way to parse the Linux \
desktop files."
LICENSE = "Artistic-2.0"

PV = "0.260.0"

RPM_NAME = "perl-Linux-DesktopFiles-0.260.0-1.10.noarch.rpm"
RPM_HASH = "5a26f6fb382ac975cc5f2c6ba07fea5f00771a6a56ec70574540dfafe309bb8209845c3432b913e5fda79d23d292827aad193a51cc4414baed23bd38e99fa05b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Linux--DesktopFiles \
perl-Linux-DesktopFiles"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
