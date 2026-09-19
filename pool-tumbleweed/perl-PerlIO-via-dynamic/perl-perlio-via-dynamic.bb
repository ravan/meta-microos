SUMMARY = "Dynamic Perlio Layers"
DESCRIPTION = "'PerlIO::via::dynamic' is used for creating dynamic PerlIO layers. It is \
useful when the behavior or the layer depends on variables. You should not \
use this module as via layer directly (ie :via(dynamic)). \
 \
Use the constructor to create new layers, with two arguments: translate and \
untranslate. Then use '$p-'via ($fh)> to wrap the handle. Once <$fh> is \
destroyed, the temporary namespace for the IO layer will be removed. \
 \
Note that PerlIO::via::dynamic uses the scalar fields to reference to the \
object representing the dynamic namespace."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.14"

RPM_NAME = "perl-PerlIO-via-dynamic-0.14-6.36.noarch.rpm"
RPM_HASH = "4511a861523fc8118fcef3ea08375e83de4fa735fc399c900197ee9e1420e901aada73d0250bc76ab04ae16d5ed17afd8cb007385b644dfe7fb1f0e5dcac6c22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-PerlIO--via--dynamic \
perl-PerlIO-via-dynamic"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
