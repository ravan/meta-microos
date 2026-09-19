SUMMARY = "The GNU Health Federation Message and Authentication Server"
DESCRIPTION = "Thalamus: The GNU Health Federation Message and Authentication Server \
===================================================================== \
 \
The Thalamus project provides a RESTful API hub to all the GNU Health \
Federation nodes. The main functions are: \
 \
 \
   the participating nodes in the GNU Health Federation and the GNU Health \
   Information System (MongoDB). Some of the participating nodes include \
   the GNU Health HMIS, MyGNUHealth mobile PHR application, \
   laboratories, research institutions and civil offices. \
 \
 \
   authorization server to interact with the GNUHealth Information System \
 \
 \
Thalamus is part of the GNU Health project, but it is a self contained, \
independent server that can be used in different health related scenarios."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.16"

RPM_NAME = "gnuhealth-thalamus-0.9.16-1.3.noarch.rpm"
RPM_HASH = "0895c287d1f8ff1229b0de2d5ce3b661f11a6b6e538144c27257d97658dd3677d9b06064be8d4b6b115ee811fa21a8c8c7e16f224d3f29a607ba7b6893ce5619"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnuhealth-thalamus \
python2-gnuhealth-thalamus \
python3.13dist-thalamus \
python3dist-thalamus"

RDEPENDS:${PN} += "/usr/bin/bash \
python-abi \
python3-Flask \
python3-Flask-HTTPAuth \
python3-Flask-RESTful \
python3-Flask-WTF \
python3-bcrypt \
python3-psycopg2"

inherit rpm
