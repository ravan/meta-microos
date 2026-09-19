SUMMARY = "Identification and authentication framework for WSGI"
DESCRIPTION = "repoze.who is an identification and authentication framework \
for arbitrary WSGI applications.  repoze.who can be configured \
either as WSGI middleware or as an API for use by an application. \
 \
repoze.who is inspired by Zope 2's Pluggable Authentication \
Service (PAS) (but repoze.who is not dependent on Zope in any \
way; it is useful for any WSGI application).  It provides no facility \
for authorization (ensuring whether a user can or cannot perform the \
operation implied by the request).  This is considered to be the \
domain of the WSGI application."
LICENSE = "SUSE-Repoze"

PV = "3.1.0"

RPM_NAME = "python313-repoze.who-3.1.0-1.4.noarch.rpm"
RPM_HASH = "82b77a7172dc6cfc6c86e0c601aabd28ec7896a7efd0ea2aca1c02305950d82d6ee76bbccce9e97b512c1ade808824d871992f4d66abac45f4b783b32571fe9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-repoze.who \
python3.13dist-repoze.who \
python313-repoze.who \
python3dist-repoze.who"

RDEPENDS:${PN} += "python-abi \
python313-WebOb \
python313-legacy-cgi \
python313-setuptools \
python313-zope.interface"

inherit rpm
