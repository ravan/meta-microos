SUMMARY = "Project Management Tool"
DESCRIPTION = "ProjectLibre is a project manager which is compatible with Microsoft \
Project 2003, 2007 and 2010 files. It has Gantt charts, PERT charts, \
network diagrams and Earned Value Costing."
LICENSE = "CPAL-1.0"

PV = "1.9.3"

RPM_NAME = "projectlibre-1.9.3-3.10.noarch.rpm"
RPM_HASH = "b28af40e13f01577a49b0e62a56398abe91e551644194bceefa4b08a3d74a14f2e92e6ddfc6b44e58509d6f564cb32d18c686de80dc0f33687b979934f20a675"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "projectlibre"

RDEPENDS:${PN} += "/usr/bin/sh \
java"

inherit rpm
