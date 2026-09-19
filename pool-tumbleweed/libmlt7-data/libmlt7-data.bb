SUMMARY = "Architecture-independent data files for the MLT multimedia framework"
DESCRIPTION = "MLT is a multimedia framework for television broadcasting. It \
provides a toolkit for broadcasters, video editors, media players, \
transcoders and web streamers."
LICENSE = "GPL-3.0-or-later"

PV = "7.40.0"

RPM_NAME = "libmlt7-data-7.40.0-1.1.noarch.rpm"
RPM_HASH = "5b8702340748a91baa5e8fc35864468a294fa79b0c9e8620b983b86307d8815685a4a2cac87bb8a654fce7b911283d4ffd4df2ca7ad8c8d7be0c8e3422b7367b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libmlt7-data"

RDEPENDS:${PN} += ""

inherit rpm
