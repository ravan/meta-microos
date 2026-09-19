SUMMARY = "Configuration file loader"
DESCRIPTION = "derpconf abstracts loading configuration files for your app."
LICENSE = "MIT"

PV = "0.8.4"

RPM_NAME = "python314-derpconf-0.8.4-2.5.noarch.rpm"
RPM_HASH = "dbcb809f66f2b90a3ffd9e981bdb3a2f434776dfe984dc60cf491730464fba49e006842a92cdaffea092b50a93169957ed2d4702ddfce9d32356306060ed66c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-derpconf \
python314-derpconf \
python3dist-derpconf"

RDEPENDS:${PN} += "python-abi"

inherit rpm
