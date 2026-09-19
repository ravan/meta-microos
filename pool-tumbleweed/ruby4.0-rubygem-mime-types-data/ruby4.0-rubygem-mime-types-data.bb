SUMMARY = "mime-types-data provides a registry for information about MIME media"
DESCRIPTION = "mime-types-data provides a registry for information about MIME media type \
definitions. It can be used with the Ruby mime-types library or other software \
to determine defined filename extensions for MIME types, or to use filename \
extensions to look up the likely MIME type definitions."
LICENSE = "MIT"

PV = "3.2024.1001"

RPM_NAME = "ruby4.0-rubygem-mime-types-data-3.2024.1001-1.10.aarch64.rpm"
RPM_HASH = "021c6a06b577b6dcb0ebabed12204f688d759487d76249e3b5cb938c5b1692417c4e03a372abb69256e0ae371b82cb8499a7dd6c9a9274d60307378ae1d457df"

RPROVIDES:${PN} += "ruby4.0-rubygem-mime-types-data \
rubygem-mime-types-data \
rubygem-ruby-4.0.0-mime-types-data \
rubygem-ruby-4.0.0-mime-types-data-3 \
rubygem-ruby-4.0.0-mime-types-data-3.2024 \
rubygem-ruby-4.0.0-mime-types-data-3.2024.1001"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
