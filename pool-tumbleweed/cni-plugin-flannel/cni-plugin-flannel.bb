SUMMARY = "A CNI network plugin that is powered by flannel"
DESCRIPTION = "This plugin is designed to work in conjunction with flannel, a network fabric \
for containers. When flannel daemon is started, it outputs a \
/run/flannel/subnet.env file that looks like this: \
 \
FLANNEL_NETWORK=10.1.0.0/16 \
FLANNEL_SUBNET=10.1.17.1/24 \
FLANNEL_MTU=1472 \
FLANNEL_IPMASQ=true \
 \
This information reflects the attributes of flannel network on the host. The \
flannel CNI plugin uses this information to configure another CNI plugin, such \
as bridge plugin."
LICENSE = "Apache-2.0"

PV = "1.8.0"

RPM_NAME = "cni-plugin-flannel-1.8.0-1.7.aarch64.rpm"
RPM_HASH = "41fc0ba9317184fc585c5755a9cf310acd05a10ddc297170afee64e2109d390c71d9ff4f99dbc8123cc255b50732d7d26e19be0d50b85fd31e18da7e7f11c82d"

RPROVIDES:${PN} += "cni-plugin-flannel"

RDEPENDS:${PN} += "flannel \
libc.so.6"

inherit rpm
