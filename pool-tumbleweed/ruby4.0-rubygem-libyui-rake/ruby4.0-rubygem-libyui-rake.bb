SUMMARY = "Rake tasks that provide basic workflow for libyui development"
DESCRIPTION = "Rake tasks that support the workflow of a libyui developer. It allows \
packaging \
a repo, sending it to the build service, creating a submit request to the \
target repo or running the client from the git repo. \
Heavily inspired by yast-rake."
LICENSE = "LGPL-2.1-only"

PV = "0.1.24"

RPM_NAME = "ruby4.0-rubygem-libyui-rake-0.1.24-1.22.aarch64.rpm"
RPM_HASH = "8db74cf554c64d922be8282feb2adc7fcc59b4c20121d02f573ebb28617c76a149705330c5d16bbf87a7a14d042c62d67154565564df0185e648c7e7b967762d"

RPROVIDES:${PN} += "ruby4.0-rubygem-libyui-rake \
rubygem-libyui-rake \
rubygem-ruby-4.0.0-libyui-rake \
rubygem-ruby-4.0.0-libyui-rake-0 \
rubygem-ruby-4.0.0-libyui-rake-0.1 \
rubygem-ruby-4.0.0-libyui-rake-0.1.24"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-packaging-rake-tasks-1 \
rubygem-ruby-4.0.0-rake"

inherit rpm
