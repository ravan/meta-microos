SUMMARY = "Perl/Mapscript map making extensions to Perl"
DESCRIPTION = "The Perl/Mapscript extension provides full map customization capabilities \
within the Perl programming language."
LICENSE = "MIT"

PV = "8.6.6"

RPM_NAME = "perl-mapscript-8.6.6-1.1.aarch64.rpm"
RPM_HASH = "bfc64fa7eb42f8a7a8832d21baae9ec3a33b2a33b72016dd3741a3af54d5c9a97fac6aac5b63e02c7871bf86a9b56b05a6790633df975ad3cbd188223bb4ec2c"

RPROVIDES:${PN} += "mapserver-perl \
perl-mapscript \
perl-mapscript--CompositingFilter \
perl-mapscript--DBFInfo \
perl-mapscript--LayerCompositer \
perl-mapscript--OWSRequest \
perl-mapscript--classObj \
perl-mapscript--clusterObj \
perl-mapscript--colorObj \
perl-mapscript--configObj \
perl-mapscript--errorObj \
perl-mapscript--fontSetObj \
perl-mapscript--hashTableObj \
perl-mapscript--imageObj \
perl-mapscript--intarray \
perl-mapscript--labelCacheMemberObj \
perl-mapscript--labelCacheObj \
perl-mapscript--labelCacheSlotObj \
perl-mapscript--labelLeaderObj \
perl-mapscript--labelObj \
perl-mapscript--layerObj \
perl-mapscript--legendObj \
perl-mapscript--lineObj \
perl-mapscript--mapObj \
perl-mapscript--markerCacheMemberObj \
perl-mapscript--outputFormatObj \
perl-mapscript--pointObj \
perl-mapscript--projectionObj \
perl-mapscript--queryMapObj \
perl-mapscript--rectObj \
perl-mapscript--referenceMapObj \
perl-mapscript--reprojectionObj \
perl-mapscript--resultCacheObj \
perl-mapscript--resultObj \
perl-mapscript--scaleTokenEntryObj \
perl-mapscript--scaleTokenObj \
perl-mapscript--scalebarObj \
perl-mapscript--shapeObj \
perl-mapscript--shapefileObj \
perl-mapscript--styleObj \
perl-mapscript--symbolObj \
perl-mapscript--symbolSetObj \
perl-mapscript--webObj \
perl-mapscriptc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmapserver.so.2 \
libmapserver2 \
libperl.so \
perl-base"

inherit rpm
