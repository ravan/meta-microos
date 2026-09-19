SUMMARY = "Remote lookup tables for agate"
DESCRIPTION = "Agate-lookup adds one-line access to lookup tables to agate."
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "python314-agate-lookup-0.3.4-1.4.noarch.rpm"
RPM_HASH = "bdbcb16bc9aabb6dcbc414cbd7434c4f5fd5ab1928f5b52373cca59bac5a2c83380cac270f761c0d5904b48c52905c4654443e2602fc406d557cb04c25a5d4a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-agate-lookup \
python314-agate-lookup \
python3dist-agate-lookup"

RDEPENDS:${PN} += "python-abi \
python314-PyYAML \
python314-agate \
python314-requests"

inherit rpm
