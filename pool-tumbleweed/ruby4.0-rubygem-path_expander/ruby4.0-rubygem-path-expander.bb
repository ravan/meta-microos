SUMMARY = "PathExpander helps pre-process command-line arguments expanding"
DESCRIPTION = "PathExpander helps pre-process command-line arguments expanding \
directories into their constituent files. It further helps by \
providing additional mechanisms to make specifying subsets easier \
with path subtraction and allowing for command-line arguments to be \
saved in a file. \
NOTE: this is NOT an options processor. It is a path processor \
(basically everything else besides options). It does provide a \
mechanism for pre-filtering cmdline options, but not with the intent \
of actually processing them in PathExpander. Use OptionParser to \
deal with options either before or after passing ARGV through \
PathExpander."
LICENSE = "MIT"

PV = "1.1.3"

RPM_NAME = "ruby4.0-rubygem-path_expander-1.1.3-1.10.aarch64.rpm"
RPM_HASH = "4684cc095e6f72e91a34374cc7837decae334342c18ba2ae7563b38d1554038145d28422e0bca3a284dd56beaea18ad8cbd31b5ce314ee1686de1089e738ec78"

RPROVIDES:${PN} += "ruby4.0-rubygem-path-expander \
rubygem-path-expander \
rubygem-ruby-4.0.0-path-expander \
rubygem-ruby-4.0.0-path-expander-1 \
rubygem-ruby-4.0.0-path-expander-1.1 \
rubygem-ruby-4.0.0-path-expander-1.1.3"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
