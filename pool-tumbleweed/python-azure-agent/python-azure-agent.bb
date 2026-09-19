SUMMARY = "Microsoft Azure Linux Agent"
DESCRIPTION = "The azure-agent supports the provisioning and running of Linux \
VMs in the Microsoft Azure Public Cloud and Microsoft Azure Stack private \
cloud. This package should be installed on Linux disk \
images that are built to run withing the Microsoft Azure or \
Microsoft Azure Stack framework."
LICENSE = "Apache-2.0"

PV = "2.14.0.1"

RPM_NAME = "python-azure-agent-2.14.0.1-2.1.noarch.rpm"
RPM_HASH = "d433a5e19db9f1169c398aa8c1e32aa7f29b605ede0493f7416447850fb636f3c03b44fbe85086fc27cb2a14645af781fc406a561c5f071f62a126b6d273b399"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "WALinuxAgent \
python-azure-agent \
python3.13dist-walinuxagent \
python3dist-walinuxagent"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
eject \
grep \
iptables \
logrotate \
openssh \
openssl \
procps \
pwdutils \
python-abi \
python313-distro \
python313-pyasn1 \
python313-xml \
sudo \
systemd \
util-linux"

inherit rpm
