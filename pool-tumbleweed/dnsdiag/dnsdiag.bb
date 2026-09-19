SUMMARY = "DNS request auditing toolset"
DESCRIPTION = "A set of tools to perform basic audits on DNS requests and responses \
to make sure DNS is working as expected. Dnsping can be used to \
measure the response time of a given DNS server for arbitrary \
requests. Just like a traditional ping utility, it provides similar \
functionality for DNS requests. \
 \
Dnstraceroute can be used to trace the path a DNS request takes to \
its destination. Its purpose is to detect whether a request is \
redirected or hijacked. This can be done by comparing different DNS \
queries being sent to the same DNS server using dnstraceroute and \
observe if there is any difference between the path. \
 \
dnseval evaluates multiple DNS resolvers and helps choosing the best \
DNS server for the network. It is recommended to use one's own DNS \
resolver as opposed to a third-party DNS server. dnseval can compare \
different DNS servers from a performance (latency) and reliability \
(loss) point of view for when DNS forwarders need to be used instead \
of a resolver."
LICENSE = "BSD-3-Clause"

PV = "2.9.4"

RPM_NAME = "dnsdiag-2.9.4-1.1.noarch.rpm"
RPM_HASH = "730d626a7af7b21748357a0f3b19e4b54057a8cc29147c8d82d5cccaaf10a5a129613e5206af480b12a098646f7ab774831d8fd9fe48020f957161983ce9b003"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dnsdiag \
python3.13dist-dnsdiag \
python3dist-dnsdiag"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-aioquic \
python3-cryptography \
python3-cymruwhois \
python3-dnspython \
python3-h2 \
python3-httpx"

inherit rpm
