SUMMARY = "The web fuzzer"
DESCRIPTION = " \
Wfuzz has been created to facilitate the task in web applications assessments \
and it is based on a simple concept: it replaces any reference to the FUZZ \
keyword by the value of a given payload. \
 \
A payload in Wfuzz is a source of data. \
 \
This simple concept allows any input to be injected in any field of an HTTP \
request, allowing to perform complex web security attacks in different web \
application components such as: parameters, authentication, forms, \
directories/files, headers, etc. \
 \
Wfuzz is more than a web content scanner: \
 \
* Wfuzz could help you to secure your web applications by finding and \
  exploiting web application vulnerabilities. Wfuzz’s web application \
  vulnerability scanner is supported by plugins. \
 \
* Wfuzz is a completely modular framework and makes it easy for even the newest \
  of Python developers to contribute. Building plugins is simple and takes \
  little more than a few minutes. \
 \
* Wfuzz exposes a simple language interface to the previous HTTP \
  requests/responses performed using Wfuzz or other tools, such as Burp. This \
  allows you to perform manual and semi-automatic tests with full context and \
  understanding of your actions, without relying on a web application scanner \
  underlying implementation. \
 \
 \
It was created to facilitate the task in web applications assessments, it's a \
tool by pentesters for pentesters ;)"
LICENSE = "GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "python313-wfuzz-3.1.0-4.5.noarch.rpm"
RPM_HASH = "e6f8157e09b6c5e4e668413d5bcca207dfbd3eef1125d48ce03ee1e4d4f012c1704d6ef79b45bf458b343e36ef313fc27617a714c0d13a36096fb348ee8fe68a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wfuzz \
python3.13dist-wfuzz \
python313-wfuzz \
python3dist-wfuzz"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
