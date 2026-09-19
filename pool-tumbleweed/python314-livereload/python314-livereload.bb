SUMMARY = "Livereload server in python"
DESCRIPTION = "Reload webpages on changes, without hitting refresh in your browser."
LICENSE = "BSD-2-Clause"

PV = "2.7.1"

RPM_NAME = "python314-livereload-2.7.1-1.5.noarch.rpm"
RPM_HASH = "e41ecbbaf38782a50d919087c3f39978b3c8a97493a5c9578e20ad1211ba488bc7f532606e34db8366f8e20252e6aaed9d0808f02618b426560270e08b0cf7c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-livereload \
python314-livereload \
python3dist-livereload"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-tornado \
update-alternatives"

inherit rpm
