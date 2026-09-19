SUMMARY = "Helm Charts as Code"
DESCRIPTION = "Helmsman is a Helm Charts (k8s applications) as Code tool which allows you to \
automate the deployment/management of your Helm charts from version controlled \
code. \
 \
How does it work? \
 \
Helmsman uses a simple declarative TOML file to allow you to describe a desired \
state for your k8s applications as in the example toml file. Alternatively YAML \
declaration is also acceptable example yaml file. \
 \
The desired state file (DSF) follows the desired state specification. \
 \
Helmsman sees what you desire, validates that your desire makes sense (e.g. \
that the charts you desire are available in the repos you defined), compares it \
with the current state of Helm and figures out what to do to make your desire \
come true."
LICENSE = "MIT"

PV = "3.17.1"

RPM_NAME = "helmsman-3.17.1-1.10.aarch64.rpm"
RPM_HASH = "ec5b8b1531347162f8cb4aafe72f0a17adde2e6ccc5ae971f65c73b9fb4a8f368982606b74aba6ca99820407aeb6e2f6fadb61b4151cb1d5729a919b4026dfca"

RPROVIDES:${PN} += "helmsman"

RDEPENDS:${PN} += "helm \
libc.so.6"

inherit rpm
