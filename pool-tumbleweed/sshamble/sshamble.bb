SUMMARY = "Security testing toolset for SSH"
DESCRIPTION = "SSHamble simulates potential attack scenarios, including \
unauthorized remote access due to unexpected state transitions, \
remote command execution in post-session login implementations \
and information leakage through unlimited high-speed authentication \
requests. \
 \
The SSHamble interactive shell provides raw access to SSH requests in \
the post-session (but pre-execution) environment, allowing for simple \
esting of environment controls, signal processing, port forwarding, \
and more."
LICENSE = "BSD-2-Clause"

PV = "0.4.0"

RPM_NAME = "sshamble-0.4.0-1.1.aarch64.rpm"
RPM_HASH = "42374906d7c693ad2b04675bed4c5708c8740d8653a0da7de91ab7499ea62ceb5939ab344f2c3bbde67c94015624a00e954cd088baa1da5890ea653a08ae10ca"

RPROVIDES:${PN} += "sshamble"

RDEPENDS:${PN} += ""

inherit rpm
