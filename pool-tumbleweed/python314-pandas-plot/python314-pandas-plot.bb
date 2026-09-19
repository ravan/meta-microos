SUMMARY = "The python pandas[plot] extra"
DESCRIPTION = "This package provides the [plot] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python314-pandas-plot-3.0.5-2.2.noarch.rpm"
RPM_HASH = "de142ba23259e951798bceb692db7357a8a0971db24756e75f999b203b95f584f159465e65f0acd4a50caa5300ffad66730971d865c20913eca34129071e0e8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-pandas-plot"

RDEPENDS:${PN} += "python314-matplotlib \
python314-pandas"

inherit rpm
