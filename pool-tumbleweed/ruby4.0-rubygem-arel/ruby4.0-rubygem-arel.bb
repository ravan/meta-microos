SUMMARY = "Arel Really Exasperates Logicians"
DESCRIPTION = "Arel Really Exasperates Logicians \
Arel is a SQL AST manager for Ruby. It \
1. Simplifies the generation of complex SQL queries \
2. Adapts to various RDBMSes \
It is intended to be a framework framework; that is, you can build your own \
ORM \
with it, focusing on innovative object and collection modeling as opposed to \
database compatibility and query generation."
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "ruby4.0-rubygem-arel-9.0.0-2.34.aarch64.rpm"
RPM_HASH = "01d7e3526c6756cb39866f5b4bb110599fef170ca64548ebf95186da9297150fa694c076f38699e12f7a07a99eb2e2c448e03c254bfe99ff4cdecb3b12f83246"

RPROVIDES:${PN} += "ruby4.0-rubygem-arel \
rubygem-arel \
rubygem-ruby-4.0.0-arel \
rubygem-ruby-4.0.0-arel-9 \
rubygem-ruby-4.0.0-arel-9.0 \
rubygem-ruby-4.0.0-arel-9.0.0"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
