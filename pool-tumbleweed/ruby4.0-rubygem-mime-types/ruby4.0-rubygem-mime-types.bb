SUMMARY = "The mime-types library provides a library and registry for"
DESCRIPTION = "The mime-types library provides a library and registry for information about \
MIME content type definitions. It can be used to determine defined filename \
extensions for MIME types, or to use filename extensions to look up the likely \
MIME type definitions. \
Version 3.0 is a major release that requires Ruby 2.0 compatibility and \
removes \
deprecated functions. The columnar registry format introduced in 2.6 has been \
made the primary format; the registry data has been extracted from this \
library \
and put into {mime-types-data}[https://github.com/mime-types/mime-types-data]. \
Additionally, mime-types is now licensed exclusively under the MIT licence and \
there is a code of conduct in effect. There are a number of other smaller \
changes described in the History file."
LICENSE = "MIT"

PV = "3.6.0"

RPM_NAME = "ruby4.0-rubygem-mime-types-3.6.0-1.10.aarch64.rpm"
RPM_HASH = "baa8d30ab9461db49eab3fc5d57023931ed7d5ad8394409d2f27da13b05c1b8b040e43ca7faa4ce87d43462807ff38b107ee7c5136cee2fa5fc4dee9aedd799e"

RPROVIDES:${PN} += "ruby4.0-rubygem-mime-types \
rubygem-mime-types \
rubygem-ruby-4.0.0-mime-types \
rubygem-ruby-4.0.0-mime-types-3 \
rubygem-ruby-4.0.0-mime-types-3.6 \
rubygem-ruby-4.0.0-mime-types-3.6.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-logger \
rubygem-ruby-4.0.0-mime-types-data-3"

inherit rpm
