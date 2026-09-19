SUMMARY = "A sophisticated build-tool for Erlang projects that follows OTP principles"
DESCRIPTION = "rebar is an Erlang build tool that makes it easy to compile and \
test Erlang applications, port drivers and releases. \
 \
rebar is a self-contained Erlang script, so it's easy to distribute or even \
embed directly in a project. Where possible, rebar uses standard Erlang/OTP \
conventions for project structures, thus minimizing the amount of build \
configuration work. rebar also provides dependency management, enabling \
application writers to easily re-use common libraries from a variety of \
locations (git, hg, etc)."
LICENSE = "Apache-2.0"

PV = "2.6.4+git20180201.b6d3094"

RPM_NAME = "erlang-rebar-2.6.4+git20180201.b6d3094-6.8.aarch64.rpm"
RPM_HASH = "4d4b5b2ce088736a3945116ec188266482d3c9f43602a17d46a5db1252d3172f0617045f98a7255b3e8e87069ef3db02ec3f8e7dd455b70657e2ac827931b7c4"

RPROVIDES:${PN} += "erlang-rebar \
rebar \
rpm-macro-rebar \
rpm-macro-rebar-compile \
rpm-macro-rebar-set-vsn-cache"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
erlang"

inherit rpm
