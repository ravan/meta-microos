SUMMARY = "Chainguard Dockerfile Converter"
DESCRIPTION = "CLI to convert Dockerfiles to use Chainguard Images and APKs in FROM and RUN \
lines etc."
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "chainguard-dfc-0.10.0-1.7.aarch64.rpm"
RPM_HASH = "5e726a1219450974cda5dca33ed641237bf6fbc9db1bf455271a8c111870443532b0eba48c99fd5eab8ff6576cdc57f946810c347fec132a046371a91df2fe17"

RPROVIDES:${PN} += "chainguard-dfc"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
