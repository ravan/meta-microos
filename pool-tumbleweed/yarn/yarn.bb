SUMMARY = "📦🐈 Fast, reliable, and secure dependency management"
DESCRIPTION = "Fast: Yarn caches every package it has downloaded, so it never needs to \
download the same package again. It also does almost everything concurrently to \
maximize resource utilization. This means even faster installs. \
 \
Reliable: Using a detailed but concise lockfile format and a deterministic \
algorithm for install operations, Yarn is able to guarantee that any \
installation that works on one system will work exactly the same on another \
system. \
 \
Secure: Yarn uses checksums to verify the integrity of every installed package \
before its code is executed."
LICENSE = "BSD-2-Clause"

PV = "1.22.22"

RPM_NAME = "yarn-1.22.22-1.8.noarch.rpm"
RPM_HASH = "5fba8176b08043d28ab259e1dd929895c1e00fb29edf1aa69c1e3a0783c96f936b3ab8eba949c4286a59084f3837eee4c980883e15fa255b35bd02440892cc00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yarn"

RDEPENDS:${PN} += "/usr/bin/node \
/usr/bin/sh \
nodejs \
sed"

inherit rpm
