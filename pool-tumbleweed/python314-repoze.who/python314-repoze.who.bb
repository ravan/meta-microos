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

RPM_NAME = "python314-repoze.who-3.1.0-1.4.noarch.rpm"
RPM_HASH = "c92d9027799f0e93d5e279b9607def050604379f02dc52f65ffeea952e26b7d61ba56ca7ee5d288a70ef448c15a81126c25566309f14e2ebb7ca57e4a90682b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-repoze.who \
python314-repoze.who \
python3dist-repoze.who"

RDEPENDS:${PN} += "python-abi \
python314-WebOb \
python314-legacy-cgi \
python314-setuptools \
python314-zope.interface"

inherit rpm
