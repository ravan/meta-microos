SUMMARY = "A Mouse role for setting attributes from a simple configfile"
DESCRIPTION = "This role loads simple configfiles to set object attributes. It is based on \
the abstract role MouseX::ConfigFromFile, and uses Config::Any to load your \
configfile. Config::Any will in turn support any of a variety of different \
config formats, detected by the file extension. See Config::Any for more \
details about supported formats. \
 \
Like all MouseX::ConfigFromFile -derived configfile loaders, this module is \
automatically supported by the MouseX::Getopt role as well, which allows \
specifying '-configfile' on the commandline."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.11"

RPM_NAME = "perl-MouseX-SimpleConfig-0.11-3.39.noarch.rpm"
RPM_HASH = "b4f2de9086cd2bf1054c3ae8e79e9b81501464c0fdd6707595cdfe36172515da63d2d551d8d6b1d11c829ea84c17255872398c6a846afc679001caf9b6f73e3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MouseX--SimpleConfig \
perl-MouseX-SimpleConfig"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Config--Any \
perl-Mouse \
perl-Mouse--Role \
perl-MouseX--ConfigFromFile"

inherit rpm
