SUMMARY = "Rake tasks providing basic work-flow for Yast development"
DESCRIPTION = "Rake tasks that support work-flow of Yast developer. It allows packaging repo, \
send it to build service, create submit request to target repo or run client \
from git repo."
LICENSE = "LGPL-2.1-only"

PV = "0.2.52"

RPM_NAME = "ruby4.0-rubygem-yast-rake-0.2.52-1.2.aarch64.rpm"
RPM_HASH = "aaf71cd5fe1f975a79d1cd83315be944794dc9433d84789020f1c1a31e057fde289accbd905501db9f3367cae6467c49261efee4d442309e8be750e4a304a564"

RPROVIDES:${PN} += "ruby4.0-rubygem-yast-rake \
rubygem-ruby-4.0.0-yast-rake \
rubygem-ruby-4.0.0-yast-rake-0 \
rubygem-ruby-4.0.0-yast-rake-0.2 \
rubygem-ruby-4.0.0-yast-rake-0.2.52 \
rubygem-yast-rake"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-packaging-rake-tasks \
rubygem-ruby-4.0.0-rake"

inherit rpm
